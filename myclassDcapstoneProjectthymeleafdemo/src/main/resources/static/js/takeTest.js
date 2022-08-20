var arrQues = [{quesId:1, ques: `<h3>When making a turn, you must ________ your speed?</h3>
                <span class='inputPar'><input type="radio" name="q1" value="A">A. maintain</span><br>
                <span class='inputPar'><input type="radio" name="q1" value="B">B. icrease</span><br>
                <span class='inputPar'><input type="radio" name="q1" value="C">C. reduce</span><br>
                <span class='inputPar'><input type="radio" name="q1" value="D">D. vary</span><br>`},
			{quesId:2, ques: `<h3>What is the capital city of Minnesota?</h3>
			                <span class='inputPar'><input type="radio" name="q1" value="A">A. Saint Paul</span><br>
			                <span class='inputPar'><input type="radio" name="q1" value="B">B. Minneapolis</span><br>
			                <span class='inputPar'><input type="radio" name="q1" value="C">C. Qoraxay</span><br>
			                <span class='inputPar'><input type="radio" name="q1" value="D">D. Rogester</span><br>`}];
var quesIndex = 0;
var option = "";
var radio = null;

function initQues() {
	renderQues();
}

function nextHandler(event) {
	quesIndex++;
	renderQues();
}

function submitHandler(event) {
	var divBody = document.querySelector(".quiz-body");
	divBody.style.display = "none";
	var divRes = document.querySelector(".quiz-result");
	divRes.style.display = "block";
	var correct = 0;
	for(var count = 0;count < arrQues.length;count++) {
		if(arrQues[count].correct) {
			correct++;
		}
	}
	divRes.innerHTML = `Your test score is ${correct} out of ${arrQues.length}`;
}

function renderQues() {
	option = "";
	radio = null;
	var divQues = document.getElementById("divQues");
	divQues.innerHTML = arrQues[quesIndex].ques;
	
		var next = document.getElementById("next");
		next.style.display = "none";
		var enter = document.getElementById("enter");
		enter.style.display = "block";
	
	var arrRadio = divQues.querySelectorAll("input")
	for(var count = 0;count < arrRadio.length;count++) {
		var radio = arrRadio[count];
		radio.addEventListener("click",radioClickHandler);
	}
}

async function radioClickHandler(event) {
	option = event.target.getAttribute("value");
	radio = event.target;
	
}

async function enterHandler(event) {
	var arrInputPar = divQues.querySelectorAll(".inputPar")
	for(var count = 0;count < arrInputPar.length;count++) {
		var span = arrInputPar[count];
		span.style.backgroundColor = "";
	}
	var quesId = arrQues[quesIndex].quesId;
	console.log(option,quesId);
	var res = await findByQuestionId(quesId,option);
	var span = radio.parentElement;
	if(res) {
		if(res.answers == option) {
			span.style.backgroundColor = "green";
			arrQues[quesIndex].correct = true;
		}
		else {
			span.style.backgroundColor = "red";
			arrQues[quesIndex].correct = false;
			var arrInput = divQues.querySelectorAll("input")
			for(var count = 0;count < arrInput.length;count++) {
				var input = arrInput[count];
				if(input.getAttribute("value") == res.answers) {
					input.parentElement.style.backgroundColor = "green";
					break;
				}
			}
		}
	}
	if(quesIndex === arrQues.length - 1) {
		var next = document.getElementById("next");
		next.style.display = "none";
		var enter = document.getElementById("enter");
		enter.style.display = "none";
		var submit = document.getElementById("submit");
		submit.style.display = "block";
	}
	else {
		var next = document.getElementById("next");
		next.style.display = "block";
		var enter = document.getElementById("enter");
		enter.style.display = "none";
		
	}
	
	console.log(res);
}

async function findByQuestionId(quesId,option) {
	const res = await fetch("http://localhost:8283/users/findByQuestionId",{
		method: "POST",
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify({questionId: quesId})
		
	});
	if(res && res.json) {
		var ret = await res.json();
		return ret;
	}
	return null;
	
}

initQues();
/**
 * 자바스크립트에 적었던것
 * 	<ul>
		<li>Apple</li>
		<li>Banana</li>
		<!-- <li></li> -->
	</ul>
	<table border="1">
		<tbody>
			<tr>
				<th>이름</th>
				<td>길동이</td>
			</tr>
		</tbody>
	</table>
	<table border="2">
		<thead>
			<tr>
				<th>이름</th><th>나이</th>
			</tr>
		</thead>
		<tbody>
			
		</tbody>
	</table>
 * 
 * 
 * 
 *  basic.js

console.log("basic.js");

let name = "홍길동";	//string
let age = 20;		//number
let obj = {name: "홍길동"
		  ,age: 20
		  ,showInfo: function(){
			  return this.name + " - " + this.age;
		  }};
		  
console.log(obj.name);
console.log(['age']);
console.log(obj.showInfo());

let data = [obj]
data.push({name: "박민수", age: 22})
data.push({name: "박민경", age: 25})

//DOM
//data배열에 있는 정보를 출력
makeList();
function makeList(){
	document.querySelector('#show table:nth-of-type(2)').className = 'table';
	//생성
	for(let i=0; i<data.length; i++){
		//tr생성		
		let tr = document.createElement('tr');
		//td생성
		let td = document.createElement('td');
		td.innerHTML = data[i]['name'];
		tr.appendChild(td);
		td = document.createElement('td');
		td.innerHTML = data[i]['age'];
		tr.appendChild(td);
		
		document.querySelector('#show table:nth-of-type(2) tbody').appendChild(tr);
	}
}



//DOM
//<li>
//let li = document.createElement('li');
//li.innerText = "cherry";

//let ul = document.querySelector('#sow ul');		//css의 선택자
//ul.appendChild('li');

//console.log(ul);	//<ul><li>Apple</li><li>Banana</li></ul>

//document.querySelectorAll('#show ul li').forEach(function(fruit){
//	fruit.style.color = 'red';
//	fruit.addEventListener('click', function(e){
//		fruit.remove();
//	});
//	console.log(fruit.innerHTML);
//});

//DOM
//tr>th+td를 생성 appendChild()실행
//let tr = document.createElement('tr');

//th, thd를 생성
//let td = document.createElement('th');
//td.innerHTML = '이름';
//tr.appendChild(td);

//td = document.createElement('td');
//td.innerHTML = name;
//tr.appendChild(td);

//appendchild
//document.querySelector('#show table tbody').appendChild(tr);



 */


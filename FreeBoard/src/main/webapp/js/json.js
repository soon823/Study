/**
 * json.js
 * {name: "홍길동", age: 20} => object
 * {"name": "홍길동", "age": 20} => json object
 * json문자열 => 자바스크립트 객체 => json문자열
 * 
 * 
 * 	<table class="table">
		<thead>
			<tr>
				<th>ID</th><th>firstName</th><th>lastName</th><th>Email</th><th>Salary</th><th>삭제</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>

 * 
 */

let obj = { name: "홍길동", age: 20 }
let json = JSON.stringify(obj);	//object -> string
obj = JSON.parse(json);	//string -> object

// JSP => 페이지 출력
//JSON 데이터 => 페이지 작성

fetch('js/MOCK_DATA.json')
	.then(function(resolve) {
		console.log(resolve);
		return resolve.json();	//object 변환 반환
	})
	.then(function(result) {
		console.log(result);
		makeList(result);
	})

// obj = JSON.parse(data);
// console.log(obj);

//obj배열에 있는 건수만큼 tr 생성하고 tbody 하위요소
function makeList(obj = []) {
	let fields = ['id', 'first_name', 'last_name', 'email', 'salary'];
	for (let i = 0; i < obj.length; i++) {
		let tr = document.createElement('tr');
		tr.addEventListener('mouseover', function(e) { tr.style.backgroundColor = 'gray' });
		tr.addEventListener('mouseout', function(e) { tr.style.backgroundColor = '' });
		//td생성 
		for (let j = 0; j < fields.length; j++) {
			let td = document.createElement('td');
			td.innerText = obj[i][fields[j]];	//obj.name 보다 obj['name'] 이 배열에 변수를 가져오기 편함
			tr.appendChild(td);
		}
		let td = document.createElement('td');
		let btn = document.createElement('button');
		btn.addEventListener('click', function(e) { btn.parentElement.parentElement.remove() });
		btn.innerHTML = '삭제';
		tr.appendChild(td);
		td.appendChild(btn);

		document.querySelector('#show tbody').appendChild(tr);
	}
}
// makeList();



/**
 * replyService.js
 * 메소드: 목록, 등록, 삭제
 */

 const svc = {
	 rlist(bno = 1, successFnc, errorFnc) {	//목록
		 fetch('replyList.do?bno='+bno)
		 	.then(resolve => resolve.json())
		 	.then(successFnc)
		 	.catch(errorFnc)
	 },
	 showMsg(msg) {
		 console.log(msg);
	 }
 }
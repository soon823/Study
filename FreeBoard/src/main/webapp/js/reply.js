/**
 * reply.js
 * replyService 생성했던 메소드 활용
 */

svc.showMsg('Hellow');

svc.rlist(287 //bno
	,function(result) {
		console.log(result);
	}//successFnc
	, function(err){
		console.log('요기',err);
	}//errorFnc
	 )
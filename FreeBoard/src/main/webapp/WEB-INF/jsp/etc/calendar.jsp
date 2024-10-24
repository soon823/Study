<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<script src='dist/index.global.js'></script>
<script>

document.addEventListener('DOMContentLoaded', async function() {
	var calendarEl = document.getElementById('calendar');
    
    //Ajax호출
    //new Promis(-성공function(){}, -실패function(){}) <- fetch안에 promis라는 객체가 반환됨
    //promis객체가 반환될때  await(async라는 함수안에서만 작동) 수행코드 -> 그다음 코드 실행
    var eventdata = [];
    
    try {
        let resolve = await fetch('eventList.do');
        if (!resolve.ok) {
            throw new Error('Network response was not ok');
        }
        let result = await resolve.json();
        eventdata = result;
        console.log(eventdata);
    } catch (error) {
        console.error('JSON 파싱 오류:', error);
    }
    
    let resolve = await fetch('eventList.do')	//fetch('eventList.do')
    let result = await resolve.json(); 			//	.then(resolve => resolve.json())
    eventdata = result;							//	.then(result => {
	console.log(result);	   					//		eventdata = result;
											    //	    console.log(result);
											    //	})
											    //	.catch(err => console.log(err)); 
    
    var calendar = new FullCalendar.Calendar(calendarEl, {
    	headerToolbar: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay'
      },
      initialDate: '2024-10-24',
      navLinks: true, // can click day/week names to navigate views
      selectable: true,
      selectMirror: true,
      select: function(arg) {
      	var title = prompt('Event Title:');
        if (title) {
        	console.log(arg);	//start, end
        	    	
        	fetch('addEvent.do?title='+title+'&start='+arg.startStr+'&end='+arg.endStr)
        	.then(resolve => resolve.json())
        	.then(result => {
	        	if(result.retCode == 'OK'){
				    calendar.addEvent({
				    title: title,
				    start: arg.start,
				    end: arg.end,
				    allDay: arg.allDay })   			
		        }else if(result.retCode == 'FAIL'){
		        	alert('에러');
		        }
		    })
        	.catch(err => {console.log(err);} );
        	        
        }
        calendar.unselect()
      },
      eventClick: function(arg) {
        if (confirm('Are you sure you want to delete this event?')) {
          arg.event.remove()
        }
      },
    	editable: true,
    	dayMaxEvents: true, // allow "more" link when too many events
    	events: eventdata		//[{},{},{}......,{}] 배열데이터를 담은 변수
      
    });

	calendar.render();	//화면출력
});

</script>
<style>
body {
	margin: 40px 10px;
	padding: 0;
	font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
	font-size: 14px;
}

#calendar {
	max-width: 1100px;
	margin: 0 auto;
}
</style>
</head>
<body>

	<div id='calendar'></div>

</body>
</html>

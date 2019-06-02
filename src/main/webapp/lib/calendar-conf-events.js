document.addEventListener('DOMContentLoaded', function() {
<!--    var Calendar = FullCalendar.Calendar;-->

    //// the individual way to do it
    // var containerEl = document.getElementById('external-events-list');
    // var eventEls = Array.prototype.slice.call(
    //   containerEl.querySelectorAll('.fc-event')
    // );
    // eventEls.forEach(function(eventEl) {
    //   new Draggable(eventEl, {
    //     eventData: {
    //       title: eventEl.innerText.trim(),
    //     }
    //   });
    // });
    /* initialize the calendar
    -----------------------------------------------------------------*/

    var calendarEl = document.getElementById('calendar');
    var calendar = new FullCalendar.Calendar(calendarEl, {
      plugins: [ 'interaction', 'dayGrid', 'timeGrid', 'list' ],
	/*  customButtons: {
	  save: {
		  text: '保存',
		  click: function() {
			  alert('保存成功!');
		  }
	      }
	    },*/
      header: {
        left: 'prev,next today',
		center: 'title',	
        right: 'dayGridMonth,timeGridWeek,timeGridDay,listWeek'
      }, 
	  views: {
      dayGridMonth: { // name of view
      titleFormat: { year: 'numeric', month: '2-digit' }
      // other view-specific options here
    }
    },
	  weekNumbers: true,
	  <!--displayEventEnd: true,-->
	  businessHour:true,
      weekNumbersWithinDays: true,
      weekNumberCalculation: 'ISO',
	  locale:'zh-cn',
	  navLinks: true,
      editable: true,
	  selectable: true,
      selectMirror: true,
      select: function(start,end,jsEvent,view) {
      $('#calendarModal').modal('toggle');
	  $("input[name='startTime']").val(start.startStr);
	  $("input[name='endTime']").val(start.endStr);	  
      },
	eventClick : function(info){
		   var date = new Date(info.event.start)
		   Y = date.getFullYear() + '-';
		   M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
		   D = date.getDate() + ' ';
		   h = date.getHours() + ':';
		   m = date.getMinutes() ;
		   var end = new Date(info.event.end)
		   eY = date.getFullYear() + '-';
		   eM = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
		   eD = date.getDate() + ' ';
		   eh = date.getHours() + ':';
		   ebm = date.getMinutes() ;
               $('#modifyCalendar').modal('toggle');
                 document.getElementById('EventText').value=info.event.title;
                 var radioval=info.event.borderColor;

	//			 $('input[name="opinions"][value='+radioval+']').attr("checked",true);
		         $(":radio[name='opinions']").val([radioval]);
				  $("input[name='startTime1']").val(Y+M+D+h+m);
		   $("textarea[id='message']").val(info.event._def.extendedProps.description);
		   $("input[name='endTime1']").val(eY+eM+eD+eh+ebm);
		   $('#deleteEvent').click(function (){
			   var mes=confirm("您确定要删除吗？");
			   if(mes==true){
				   info.event.remove();
				   $('#modifyCalendar').modal('hide');
			   }
			   else{
				   $('#modifyCalendar').modal('toggle');
			   }
		   });
		   $('#modifyEvent').click(function (){
				   var mes=confirm("您确定要更改吗？");
				   if(mes==true){
					   var evenTtitle=document.getElementById("EventText").value;
					   console.log(evenTtitle);
					   info.event.title=evenTtitle;
					   console.log(info.event.title);
					  /*
					   info.event.setExtendedProp(info.event.title,document.getElementById("EventText").value);
					   info.event.set(this.title=evenTtitle);*/
	//				   console.log(info.event);

					   /*console.log(info);
                       info.event.title.(title);
                       console.log(document.getElementById("EventText").value);
                       info.event.start.valueOf($("input[name='startTime1']").val());
                       info.event.end =$("input[name='endTime1']").val();
                       info.event.borderColor = $('input:radio[name="opinions"]:checked').val();
                       info.event._def.extendedProps.description =$("textarea[id='message']").val();*/
					   $('#modifyCalendar').modal('hide');
					   alert("更改成功！");
				   }
				   else{
					   $('#modifyCalendar').modal('toggle');
				   }
			   }
		   );
		   },
      
      eventLimit: true,
	  events: [{
			  title: 'chifan ',
			  description:'vcxvxcvxcvzxvc',			 
			  start: '2019-05-11 14:30',
		      color:'#d95341',
			  end: '2019-05-15'
		  } 
		]
});

	$('#saveEvent').click(function (){
	   var eventdata;
	   var title=document.getElementById("newEventText").value;
	   var start=$("input[name='startTime']").val();
	   var end=$("input[name='endTime']").val();
	   var radioVal = $('input:radio[name="opinion"]:checked').val();
	   var eventDesc =$("textarea[id='message-text']").val();
		if (title) {
          	calendar.addEvent({
            title: title,
			color:radioVal,
            start:start,
            end:end,
			description:eventDesc
               })
			calendar.unselect()
             }
		$('#calendarModal').modal('hide');
		document.getElementById("newEventText").value='';
		$("textarea[id='message-text']").val('');
	}
	);


	calendar.render();
});

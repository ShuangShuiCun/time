//date picker start




//datetime picker start


$(".form_datetime-component").datetimepicker({
    format: "dd MM yyyy - hh:ii"
});

$(".form_datetime-adv").datetimepicker({
    format: "dd MM yyyy - hh:ii",
    autoclose: true,
    todayBtn: true,
    startDate: "2013-02-14 10:00",
    minuteStep: 10
});

$('.form_datetime').datetimepicker({
	    format: 'yyyy-mm-dd hh:ii',
        language:  'zh-CN',
		startDate: "2019-05-14 10:00",
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1
    });

//datetime picker end

//timepicker start


//timepicker end


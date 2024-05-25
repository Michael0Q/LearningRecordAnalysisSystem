$(document).ready(function(){
	$('#weeklyRecordSection .button').on('click', function(){
		console.log("executed");
		getMonthlyData();
	});
});

$('#weeklyRecordSection .button').on('click', function(){
	console.log("executed");
	getMonthlyData();
});

function getMonthlyData(){
	$.ajax({
		url: '/Home/getWeeklyData',
		method: 'POST',
		dataType: 'json',
		success: function(jsonData){
			handleResponse(jsonData);
		}
	});
}


function handleResponse(jsonData){
	console.log(jsonData);
	let data = jsonData
	makeChart(data);
}

function makeChart(data){
	let labels = ['月','火','水','木','金','土','日'];
	let values = [data.monday, data.tuesday, data.wednesday, data.thursday, data.friday, data.saturday, data.sunday];

	let graph = $('.weeklyRecord');
	new Chart(graph, {
		type: 'bar',
		data: {
			labels: labels,
			datasets: [{
				label: '週間学習量',
				data: values,
				backgroundColor: '#00A4EA'
			}]
		},
		options: {
			responsive: true,
			scales: {
				y:{
					beginAtZero: true
				}
			}
		}
	});
}
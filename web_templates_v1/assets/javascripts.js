//nnkjnkj
/* #880808 - blood red
   #c0c0c0 - silver
   #4A0404 - oxblood red
   #ED1C24 - MS Paint red
   #C3C3C3 - MS Paint Grey
*/

//chart 1 for displaying number of machines in use -- start
var xValues = ["Group 1", "Group 2", "Group 3", "Group 4", "Group 5"];
var yValues = [55, 49, 44, 24, 15];
var barColors = ["#9A0404", "#1A0404","#5A0404","#FA0404","#4A0404"];

new Chart("myChart", {
  type: "pie",
  data: {
    labels: xValues,
    datasets: [{
      backgroundColor: barColors,
      data: yValues
    }]
  },
  options: {
    legend: {display: false},
    title: {
      display: true,
      text: "Number of VMs in use per intake"
    }
  }
});
//chart 1 for displaying number of machines in use -- end
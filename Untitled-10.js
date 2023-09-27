$("ol,ul").on("click","input",function(){
    var data = getDate();
    var index = $(this).sibings("a").attr("id");
    console.log(index);
    data[index].done = $(this).prop()

})      
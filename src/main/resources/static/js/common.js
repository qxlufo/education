/**同步请求Get*/
function api_get(url,datajson){
    var d;
    $.ajax({
        type: "GET",
        url: url,
        data: datajson,
        dataType: "json",
        async:false,
        success: function(data){
            d = data;
        }
    });
    return d;
}
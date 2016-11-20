window.onload=function(){

    loadarticles(1,"高数")
}

function loadarticles(page,articleType) {
    var innerHTML="";
    var string="loadarticles?page="+page+"&articleType="+articleType;
    var request = new XMLHttpRequest();
    string=encodeURI(string);
    request.open("GET",string);
    request.send();
    request.onreadystatechange = function() {
        if (request.readyState===4) {
            if (request.status===200) {
                var packJson=  JSON.parse(request.responseText);
                for(var index = 0; index < packJson.length; index++){
                    innerHTML+="<tr><td>"+packJson[index].articleId+"</td><td>"+packJson[index].title+"</td><td>"+packJson[index].articleType+"</td><td>修改 删除</td></tr>";
                }
                try{
                    document.getElementById("articleList").innerHTML=innerHTML;
                } catch(e) {
                    setTBodyInnerHTML(document.getElementById("articleList"),innerHTML);
                }
            }
        }
    }
}

function setTBodyInnerHTML(tbody, html) {
    var div = document.createElement('div');
    div.innerHTML = "<table><tbody id='tableBody'>" + html + "</tbody></table>";
    tbody.parentNode.replaceChild(div.firstChild.firstChild, tbody)
}
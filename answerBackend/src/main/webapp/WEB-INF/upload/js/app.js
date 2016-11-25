/**
 * Created by TsuiXh on 16/11/24.
 */

var showPic = function (obj) {
    var img = document.createElement("img");
    img.style.width = "120px";
    img.style.height = "120px";
    img.style.borderRadius = "5px";
    img.style.marginBottom = "5px";
    /*
        以下形式只有在IE中有效，在Chrome,火狐，Edge中无效
     */
    //img.src = obj.value;
    //以下代码测试另外一种方法
    var source = window.URL.createObjectURL(obj.files[0]);
    img.src = source;
    console.info(obj.value);
    img.onerror = function(){
        this.parentNode.removeChild(this);
        alert("请选择其他图片");
    };

    var imgShow = document.getElementById("imgShow");
    imgShow.innerHTML = "";
    imgShow.appendChild(img);
};
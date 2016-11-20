/**
 * Created by Yunhong on 16/11/13.
 */

var check_btn = document.getElementById("remember_me");
var input_acc = document.getElementById("inputAccount");
var input_pas = document.getElementById("inputPassword");

console.info(input_acc);
console.info(input_pas);
console.info(input_pas.value);
console.info(input_acc.value);

// $("login").onclick = function () {
//     if (input_acc.value != null && input_pas != null) {
//         //提交表单
//         alert("提交表单");
//     } else {
//         alert("尚未输入账号或密码");
//     }
//
//     //记住账号
//     if (check_btn.checkOn) {
//         setCookie("wulijiexi", $("account").value);
//     }
// };

// 设置cookie
function setCookie(value) {
    var days = 7;
    var exp = new Date();
    exp.setTime(exp.getTime() + days*24*60*60*1000);
    document.cookie = "wulijiexi=" + encodeURI(value) + ";expires=" + exp.toTimeString();
}

//表单提交验证
function verify() {
    alert("verify");
    console.info(input_acc.value);
    console.info(input_pas.value);
};
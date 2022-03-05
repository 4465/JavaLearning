//javaScript动态语言，运行过程中可以改变自身的结构
function f(){
    var x = "var a=3;var b=5; alert(a+b)";
    eval(x)  //改变了x,x原本是字符串，通过eval()后编程可运行的代码
}
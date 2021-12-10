//添加教师
function show_insert_tea() {
    var result = document.getElementById("result");
    var show = "<div id='show_insert_tea'  class='d_form'>"
        + "<h3>添加教师</h3>"
        +"<form action='AddTea' method='post'>"
        + "<input type='text' autofocus='autofocus' name='tno' value placeholder='工号' required>"
        + "<input type='text'  name='tname' value placeholder='姓名' required>"
        + "<input type='text'  name='tsex' value placeholder='性别' required>"
        + "<input type='text'  name='tage' value placeholder='年龄' required>"
        + "<input type='text'  name='ttitle' value placeholder='职称' required>"
        + "<input type='text'  name='tphone' value placeholder='电话' required>"
        + "<input id='submit' type='submit' name='submit' value='添加'>"
        +"</form>"
        + "</div>";
    result.innerHTML = show;
}
//删除学生
function show_delete_stu() {
    var result = document.getElementById("result");
    var show = "<div id='show_insert_stu'  class='d_form'>"
        + "<h3>删除学生或教师</h3>"
        +"<form action='DelStu' method='post'>"
        + "<input type='text' autofocus='autofocus' name='sno' value placeholder='学号或工号' required>"
        + "<input id='submit' type='submit' name='submit' value='删除'>"
        +"</form>"
        + "</div>";
    result.innerHTML = show;
}
//添加学生
function show_insert_stu() {
    var result = document.getElementById("result");
    var show = "<div id='show_insert_stu'  class='d_form'>"
        + "<h3>添加学生</h3>"
        +"<form action='AddStu' method='post'>"
        + "<input type='text' autofocus='autofocus' name='sno' value placeholder='学号' required>"
        + "<input type='text'  name='sname' value placeholder='姓名' required>"
        + "<input type='text'  name='ssex' value placeholder='性别' required>"
        + "<input type='text'  name='sage' value placeholder='年龄' required>"
        + "<input type='text'  name='splace' value placeholder='生源地' required>"
        + "<input type='text'  name='credits' value placeholder='总学分' required>"
        + "<input type='text'  name='cno' value placeholder='班级号' required>"
        + "<input id='submit' type='submit' name='submit' value='添加'>"
        +"</form>"
        + "</div>";
    result.innerHTML = show;
}
//管理员密码修改
function show_alter_adminpassword() {
    var result = document.getElementById("result");
    var show = "<div id='show_alter_adminpassword'  class='d_form'>"
        + "<h3>密码修改</h3>"
        +"<form action='AlterAdminPasswordServlet' method='post'>"
        + "<input type='text' autofocus='autofocus' name='password' value placeholder='新密码' required>"
        + "<input id='submit' type='submit' name='submit' value='修改'>"
        +"</form>"
        + "</div>";
    result.innerHTML = show;
}
//学生成绩插入
function show_insert_stuscore() {
    var result = document.getElementById("result");
    var show = "<div id='show_insert_stuscore'  class='d_form'>"
        + "<h3>学生成绩录入</h3>"
        +"<form action='StuScoreInsertServlet' method='post'>"
        + "<input type='text' autofocus='autofocus' name='no' value placeholder='学生学号' required>"
        + "<input type='text'  name='couno' value placeholder='课程号'required >"
        + "<input type='text'  name='score' value placeholder='成绩' required>"
        + "<input id='submit' type='submit' name='submit' value='录入'>"
        +"</form>"
        + "</div>";
    result.innerHTML = show;
}
//学生密码修改
function show_alter_stupassword() {
    var result = document.getElementById("result");
    var show = "<div id='show_alter_stupassword'  class='d_form'>"
        + "<h3>密码修改</h3>"
        +"<form action='AlterStuPasswordServlet' method='post'>"
        + "<input type='text' autofocus='autofocus' name='password' value placeholder='新密码' required>"
        + "<input id='submit' type='submit' name='submit' value='修改'>"
        +"</form>"
        + "</div>";
    result.innerHTML = show;
}
//教师密码修改
function show_alter_teapassword() {
    var result = document.getElementById("result");
    var show = "<div id='show_alter_stupassword'  class='d_form'>"
        + "<h3>密码修改</h3>"
        +"<form action='AlterTeaPasswordServlet' method='post'>"
        + "<input type='text' autofocus='autofocus' name='password' value placeholder='新密码' required>"
        + "<input id='submit' type='submit' name='submit' value='修改'>"
        +"</form>"
        + "</div>";
    result.innerHTML = show;
}
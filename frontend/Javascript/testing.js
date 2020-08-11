const url = 'http://localhost:8080';

function fetchmatched(user) {

    $.get(url + "/Home/Match/"+user, function (response) {
        let users = response;

        let usersTemplateHTML = "";

        for (let i = 0; i < users.length; i++) {

            let coursesTemplateHTML = "";
            let courses=users[i].courses;
            for (let i = 0; i < courses.length; i++) {
                coursesTemplateHTML=coursesTemplateHTML+
                    '<tr>'+
                    '<td>'+courses[i].course_title+'</td>'+
                    '<td>'+courses[i].course_difficulty+ '</td>'+
                    '<td>'+courses[i].course_organization+'</td>'+
                    '<td>'+courses[i].course_rating+'</td>'+
                    '</tr>';
            }
            usersTemplateHTML = usersTemplateHTML  +
                '<div class="member-entry">'+
                '<h4>'+user+' Matches with '+users[i].username+'</h4>'+
                '<div class="member-img">'+
                '<img src="static/user.png" class="img-rounded">'+

                '</div>'+
                '<div class="member-details">'+
                '<div class="row info-list">'+
                '<div class="courses">'+
                '<div style="width:auto; height:180px; overflow:auto;">'+
                '<table class="table table-bordered" id="table-bordered">'+
                '<thead>'+
                '<tr>'+
                '<th>Course Name</th>'+
                '<th>Course Difficulty</th>'+
                '<th>Course Organization</th>'+
                '<th>Course Rating</th>'+
                '</tr>'+
                '</thead>'+
                coursesTemplateHTML+
                '</table>'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</div>';
        }
        $('#usersList').html(usersTemplateHTML);
        $('#title').html("Matching with")
    });
}



function fetchAll() {

    $.get(url + "/Home/Users", function (response) {
        let users = response;
        let usersTemplateHTML = "";
        for (let i = 0; i < users.length; i++) {

            let coursesTemplateHTML = "";
            let courses=users[i].courses;
            for (let j = 0; j < courses.length; j++) {
                coursesTemplateHTML=coursesTemplateHTML+
                    '<tr>'+
                    '<td>'+courses[j].course_title+'</td>'+
                    '<td>'+courses[j].course_difficulty+ '</td>'+
                    '<td>'+courses[j].course_organization+'</td>'+
                    '<td>'+courses[j].course_rating+'</td>'+
                    '</tr>';
            }
            usersTemplateHTML = usersTemplateHTML  +
                '<div class="member-entry">'+
                '<h4>'+users[i].username+'</h4>'+
                '<div class="member-img">'+
                '<img src="static/user.png" class="img-rounded">'+
                '<br/>'+
                '<a   href="#"  class="button-match" onclick="fetchmatched(\'' + users[i].username + '\')";>Match</a>'+
                '</div>'+
                '<div class="member-details">'+
                '<div class="row info-list">'+
                '<div class="courses">'+
                '<div style="width:auto; height:180px; overflow:auto;">'+
                '<table class="table table-bordered" id="table-bordered">'+
                '<thead>'+
                '<tr>'+
                '<th>Course Name</th>'+
                '<th>Course Difficulty</th>'+
                '<th>Course Organization</th>'+
                '<th>Course Rating</th>'+
                '</tr>'+
                '</thead>'+
                coursesTemplateHTML+
                '</table>'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</div>'+
                '</div>';
        }
        $('#usersList').html(usersTemplateHTML);
    });
}
<%@ include file="header.jsp"%>
<%@ include file="navigation.jsp"%>
<div class="container">
    <h1>Your TODOs</h1>
    <table class="table">
        <thead>
            <tr>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                    <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add TODO</a>
</div>
<%@ include file="footer.jsp"%>
<%@ include file="header.jsp"%>
<%@ include file="navigation.jsp"%>
<div class="container">
    <h1>Enter TODO Details</h1>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" path="description" required="required"/>
            <form:errors type="text" path="description" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" path="targetDate" required="required"/>
            <form:errors type="text" path="targetDate" cssClass="text-warning"/>
        </fieldset>

        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>
</div>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd',
    });
</script>
<%@ include file="footer.jsp"%>
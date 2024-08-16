<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
<h2>Student Enquiry Form</h2>

  <form:form action="save" modelAttribute="student" method="POST">
  <table>
  <tr>
  <td>Name:</td>
  <td><form:input path="name"/></td>
  </tr>
  <tr>
  <td>Email:</td>
  </tr>
  </table>
  </form:form>
</body>
</html>
package com.example.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.example.form.UserForm;

public class UserAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        UserForm userForm = (UserForm) form;
        System.out.println("UserName: " + userForm.getUserName());
        System.out.println("UserID: " + userForm.getUserId());
        request.setAttribute("userForm", userForm);
        return mapping.findForward("success");
    }
}

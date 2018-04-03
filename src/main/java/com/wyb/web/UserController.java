package com.wyb.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wyb.aop.SystemLog;
import com.wyb.model.Book;
import com.wyb.model.User;
import com.wyb.service.BookService;
import com.wyb.service.UserService;

@Controller
@RequestMapping("/user")
// url:/模块/资源/{id}/细分 /seckill/list
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String list(Model model) {
		User user = userService.findUserById(1);
		model.addAttribute("list", user);
		System.out.println(user.toString());
		// String result = JSONObject.fromObject(user).toString();
		return "userList";// WEB-INF/jsp/"list".jsp
	}

	@ResponseBody
	@RequestMapping(value = "/{userId}/detail", method = RequestMethod.GET)
	@SystemLog(methods = "用户管理", module = "用户登陆")
	private String detail(@PathVariable("userId") Long bookId, Model model) {

		User user = userService.findUserById(1);
		model.addAttribute("list", user);
		// String result = JSONObject.fromObject(user).toString();
		return user.toString();// WEB-INF/jsp/"list".jsp
	}
	/*
	 * //ajax json
	 * 
	 * @RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST,
	 * produces = { "application/json; charset=utf-8" })
	 * 
	 * @ResponseBody private Result<AppointExecution>
	 * appoint(@PathVariable("bookId") Long bookId, @RequestParam("studentId")
	 * Long studentId) { if (studentId == null || studentId.equals("")) { return
	 * new Result<>(false, "学号不能为空"); } //AppointExecution execution =
	 * bookService.appoint(bookId, studentId);//错误写法，不能统一返回，要处理异常（失败）情况
	 * AppointExecution execution = null; try { execution =
	 * bookService.appoint(bookId, studentId); } catch (NoNumberException e1) {
	 * execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER); }
	 * catch (RepeatAppointException e2) { execution = new
	 * AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT); } catch
	 * (Exception e) { execution = new AppointExecution(bookId,
	 * AppointStateEnum.INNER_ERROR); } return new
	 * Result<AppointExecution>(true, execution); }
	 */

}
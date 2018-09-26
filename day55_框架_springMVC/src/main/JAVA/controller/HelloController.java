package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * hello controller（处理器）
 */
@Controller
// 在类上面使用，对请求的url进行分类管理（窄化请求）
//@RequestMapping("hello")
public class HelloController {

    /**
     *
     *
     * ModelAndView：模型和视图。用于封装响应的模型数据；用于封装响应的视图（页面）
     *
     *  @RequestMapping注解：配置请求的url
     */
    @RequestMapping("/hello.do")
    public ModelAndView hello(){

        // 1.创建ModelAndView
        ModelAndView mav = new ModelAndView();

        // 2.封装响应的模型数据
        /**
         * addObject：封装响应的模型数据
         * 参数：
         *      参数一：模型的名称
         *      参数二：模型数据值
         */
        mav.addObject("hello","89全体同仁");

        // 3.封装响应的视图
        /**
         * setViewName：设置视图的名称（页面的路径）
         * 参数：页面的路径
         */
       // mav.setViewName("/WEB-INF/jsp/success.jsp");
        mav.setViewName("success");

        return mav;
    }

    /**
     * @RequestMapping注解学习专用
     *
     *  作用一：配置请求的url
     *      属性：
     *          value：是个数组，可以配置多个请求的url
     *      细节：
     *          "/"和".do"是可以省略的
     *   作用二：限制http请求方法
     *      属性：
     *          method：显示http请求方法
     *
     *      细节：
     *          RequestMethod.POST：只允许post请求
     *
     *
     *
     */
    //@RequestMapping("/requestMapping.do")
    //@RequestMapping(value={"/requestMapping.do","/requestMappingAAA.do"})
   // @RequestMapping(value={"requestMapping"})
    @RequestMapping(value={"requestMapping"},method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView requestMapping(){

        // 1.创建ModelAndView
        ModelAndView mav = new ModelAndView();

        // 2.封装响应的模型数据
        mav.addObject("hello","@RequestMapping注解学习。");

        // 3.封装响应的视图
        mav.setViewName("success");


        return mav;
    }

}

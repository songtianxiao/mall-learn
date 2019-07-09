package store.aiss.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import store.aiss.mall.common.api.CommonResult;
import store.aiss.mall.dto.UmsAdminParam;
import store.aiss.mall.model.UmsAdmin;
import store.aiss.mall.service.UmsAdminService;

/**
 * 类说明：后台用户管理系统
 */
@RestController
@Api(tags = "UmsAdminController" ,description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController{

    @Autowired
    private UmsAdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<UmsAdmin> register(@RequestBody UmsAdminParam umsAdminParam, BindingResult result){
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(umsAdmin);
    }




}

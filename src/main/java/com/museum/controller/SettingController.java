package com.museum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.museum.model.Setting;
import com.museum.service.SettingService;

@Controller
public class SettingController {

	@Autowired
	private SettingService settingService;
	
	@GetMapping("/app_setting")
	public String app_Setting(Model model) {
		model.addAttribute("listSetting",settingService.getAllSetting());
		return "app_Setting";
	}
	
	@RequestMapping("/saveSetting")
	public String saveSetting(Setting setting,Model model) {
		settingService.saveSetting(setting);
		return "redirect:/addSetting";
	}
	
	@GetMapping("/addSetting")
	public String addSetting(Setting setting,Model model) {
		
		model.addAttribute("setting",setting);
		return "app_Setting";
		
	}
	
	
}

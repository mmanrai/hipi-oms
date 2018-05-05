package com.manrai.hipi.oms.cucumber.stepdefs;

import com.manrai.hipi.oms.HipiomsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HipiomsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

package com.akhambir.xmlbased.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest {

    @Mock
    private HomeController homeController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
    }

    @Test
    public void testHomeJspReturn() throws Exception {
        String requestPath = "/";
        String responseJspName = "home";

        when(homeController.homePage()).thenReturn(responseJspName);

        mockMvc.perform(get(requestPath))
                .andExpect(status().isOk())
                .andExpect(view().name(responseJspName));
    }

    @Test
    public void testFloodLineJspReturn(Model model) throws Exception {
        String requestPath = "/flood";
        String responseJspName = "floodLine";

        when(homeController.floodLine(model)).thenReturn(responseJspName);

        mockMvc.perform(get(requestPath))
                .andExpect(status().isOk())
                .andExpect(view().name(responseJspName));
    }

    @Test
    public void testLoginJspReturn() throws Exception {
        String requestPath = "/loginPage";
        String responseJspName = "login";

        when(homeController.loginPage()).thenReturn(responseJspName);

        mockMvc.perform(get(requestPath))
                .andExpect(status().isOk())
                .andExpect(view().name(responseJspName));
    }
}

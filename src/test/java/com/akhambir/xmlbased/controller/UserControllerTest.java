package com.akhambir.xmlbased.controller;

import com.akhambir.xmlbased.model.User;
import com.akhambir.xmlbased.services.interfaces.UserService;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void shouldReturnRegisterJspWithUserModel() throws Exception {
        String requestPath = "/register/addUser";
        String responseJspName = "registrationPage";

        mockMvc.perform(get(requestPath))
                .andExpect(status().isOk())
                .andExpect(view().name(responseJspName))
                .andExpect(model().attribute("newUser", instanceOf(User.class)));
    }

    @Test
    public void shouldTakeUserAndReturnSameObject() throws Exception {
        User user = new User();
        when(userService.addUser(user)).thenReturn(user);

        mockMvc.perform(post("/register/addUser"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) verify(userService).addUser(user))
                //.andExpect(model().attribute("newUser", user))
                .andExpect(view().name("newUserPage"));
    }
}

/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.example.controller;

import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Unit tests for {@link TemplateController}.
 */
public class TemplateControllerTests extends ControllerTests
{
  /**
   * Tests that the templating engines home page can be loaded correctly.
   */
  @Test
  public void testHome() throws Exception
  {
    mock.perform(get("/template"))
        .andExpect(status().isOk())
        .andExpect(view().name("page/thymeleaf/template/home"));
  }

  /**
   * Tests that the Jad4J templating engines page can be loaded correctly.
   */
  @Test
  public void testJade4j() throws Exception
  {
    mock.perform(get("/template/jade4j"))
        .andExpect(status().isOk())
        .andExpect(view().name("page/jade/template/template"));
  }

  /**
   * Tests that the Thymeleaf templating engines page can be loaded correctly.
   */
  @Test
  public void testThymeleaf() throws Exception
  {
    mock.perform(get("/template/thymeleaf"))
        .andExpect(status().isOk())
        .andExpect(view().name("page/thymeleaf/template/template"));
  }

  protected Object controller()
  {
    return new TemplateController();
  }
}

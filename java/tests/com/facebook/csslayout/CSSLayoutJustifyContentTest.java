/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

 // @Generated by gentest/gentest.rb from gentest/fixtures/CSSLayoutJustifyContentTest.html

package com.facebook.csslayout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CSSLayoutJustifyContentTest {
  @Test
  public void test_justify_content_row_flex_start() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setWidth(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setWidth(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(92f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(82f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(72f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_row_flex_end() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setJustifyContent(CSSJustify.FLEX_END);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setWidth(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setWidth(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(72f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(82f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(92f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_row_center() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setJustifyContent(CSSJustify.CENTER);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setWidth(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setWidth(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(46f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(56f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(56f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(46f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_row_space_between() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setJustifyContent(CSSJustify.SPACE_BETWEEN);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setWidth(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setWidth(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(46f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(92f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(92f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(46f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_row_space_around() {
    final CSSNode root = new CSSNode();
    root.setFlexDirection(CSSFlexDirection.ROW);
    root.setJustifyContent(CSSJustify.SPACE_AROUND);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setWidth(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setWidth(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setWidth(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(12f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(46f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(80f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(80f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(46f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(12f, root_child2.getLayoutX(), 0.0f);
    assertEquals(0f, root_child2.getLayoutY(), 0.0f);
    assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(102f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_column_flex_start() {
    final CSSNode root = new CSSNode();
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setHeight(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(10f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(10f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(10f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(10f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_column_flex_end() {
    final CSSNode root = new CSSNode();
    root.setJustifyContent(CSSJustify.FLEX_END);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setHeight(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setHeight(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(72f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(82f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(92f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(72f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(82f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(92f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_column_center() {
    final CSSNode root = new CSSNode();
    root.setJustifyContent(CSSJustify.CENTER);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setHeight(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setHeight(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(36f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(46f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(56f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(36f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(46f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(56f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_column_space_between() {
    final CSSNode root = new CSSNode();
    root.setJustifyContent(CSSJustify.SPACE_BETWEEN);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setHeight(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setHeight(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(46f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(92f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(46f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(92f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_justify_content_column_space_around() {
    final CSSNode root = new CSSNode();
    root.setJustifyContent(CSSJustify.SPACE_AROUND);
    root.setWidth(102f);
    root.setHeight(102f);

    final CSSNode root_child0 = new CSSNode();
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);

    final CSSNode root_child1 = new CSSNode();
    root_child1.setHeight(10f);
    root.addChildAt(root_child1, 1);

    final CSSNode root_child2 = new CSSNode();
    root_child2.setHeight(10f);
    root.addChildAt(root_child2, 2);
    root.setDirection(CSSDirection.LTR);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(12f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(46f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(80f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

    root.setDirection(CSSDirection.RTL);
    root.calculateLayout(null);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(102f, root.getLayoutWidth(), 0.0f);
    assertEquals(102f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(12f, root_child0.getLayoutY(), 0.0f);
    assertEquals(102f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(46f, root_child1.getLayoutY(), 0.0f);
    assertEquals(102f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child2.getLayoutX(), 0.0f);
    assertEquals(80f, root_child2.getLayoutY(), 0.0f);
    assertEquals(102f, root_child2.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
  }

}

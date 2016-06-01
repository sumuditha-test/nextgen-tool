/*
 * Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.diagram.edit.custom;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * This class is the view representation of the general complex mediators.
 *
 */
public class LifeLineShape extends RoundedRectangle {
	RectangleFigure propertyValueRectangle1;
	RoundedRectangle leftRectangle;
	RoundedRectangle middleRectangle;
	RoundedRectangle bottomRectangle;
	RoundedRectangle containerInsideLeftRectangle;
	RoundedRectangle containerInsideLeftRectangle2;
	RoundedRectangle containerInsideLeftRectangle3;
	private LayeredPane pane;
	private Layer figureLayer;
	private Layer breakpointLayer;
	private Layer skipPointLayer;
	static int Image_PreferredWidth = 75;
	static int Image_PreferredHeight = 42;
	protected String toolTipMessage;
	private WrappingLabel fFigureLoopStatementNameFigure;

	
	public LifeLineShape(WrappingLabel fFigureLoopStatementNameFigure){
	this.fFigureLoopStatementNameFigure = fFigureLoopStatementNameFigure;	
		init();
	}
	
    public LifeLineShape() {
        init();
    }

	private void init() {
		GridLayout layoutThis = new GridLayout();
        layoutThis.numColumns = 1;
        layoutThis.makeColumnsEqualWidth = true;
        layoutThis.marginHeight = 0;
        layoutThis.marginWidth = 0;
        this.setLayoutManager(layoutThis);
        this.setCornerDimensions(new Dimension(1, 1));
        this.setOutline(false);
        this.setBorder(new LineBorder(new Color(null, 250, 250, 250), 2, SWT.BORDER_DOT));
        createContents();
	}

    public void setToolTipMessage(String message) {
        toolTipMessage = message;
    }




	private void createContents() {

		pane = new LayeredPane();
		pane.setLayoutManager(new StackLayout());
		figureLayer = new Layer();
		figureLayer.setLayoutManager(new GridLayout());

		leftRectangle = new RoundedRectangle();
		leftRectangle.setCornerDimensions(new Dimension(1, 1));
		leftRectangle.setOutline(false);
		leftRectangle.setFill(false);
		
		
		//LineBorder innerRectBorder1 = new LineBorder(
				//new Color(null, 100, 100, 100), 1, SWT.BORDER_SOLID);
		//leftRectangle.setBorder(innerRectBorder1);
		
		//leftRectangle.setPreferredSize(new Dimension(110, 30));
		//leftRectangle.setMinimumSize(new Dimension(90, 95));

		GridLayout layoutGraphicalNodeContainer = new GridLayout();
		layoutGraphicalNodeContainer.numColumns = 1;
		//layoutGraphicalNodeContainer.horizontalSpacing = 5;
		//layoutGraphicalNodeContainer.verticalSpacing = 5;
		//layoutGraphicalNodeContainer.marginHeight = 5;
		//layoutGraphicalNodeContainer.marginWidth = 5;
		leftRectangle.setLayoutManager(layoutGraphicalNodeContainer);
		
		
		//
		middleRectangle = new RoundedRectangle();
		middleRectangle.setCornerDimensions(new Dimension(1, 1));
		middleRectangle.setOutline(false);
		middleRectangle.setFill(false);
		//middleRectangle.setPreferredSize(new Dimension(110, 30));
		//middleRectangle.setMinimumSize(new Dimension(90, 95));
		
		//LineBorder innerRectBorder2 = new LineBorder(
				//new Color(null, 100, 100, 100), 1, SWT.BORDER_SOLID);
		//middleRectangle.setBorder(innerRectBorder2);
		
		

		GridLayout layoutMiddleGraphicalNodeContainer = new GridLayout();
		layoutMiddleGraphicalNodeContainer.numColumns = 1;
		//layoutMiddleGraphicalNodeContainer.horizontalSpacing = 5;
		//layoutMiddleGraphicalNodeContainer.verticalSpacing = 5;
		//layoutMiddleGraphicalNodeContainer.marginHeight = 5;
		//layoutMiddleGraphicalNodeContainer.marginWidth = 5;
		middleRectangle.setLayoutManager(layoutMiddleGraphicalNodeContainer);
		//

		GridData constraintGraphicalNodeContainer = new GridData();
		constraintGraphicalNodeContainer.verticalAlignment = GridData.CENTER;
		constraintGraphicalNodeContainer.horizontalAlignment = GridData.CENTER;
		
		
		
		GridData constraintMiddleGraphicalNodeContainer = new GridData();
		constraintMiddleGraphicalNodeContainer.verticalAlignment = GridData.CENTER;
		constraintMiddleGraphicalNodeContainer.horizontalAlignment = GridData.CENTER;

		
		//
		
		
		bottomRectangle = new RoundedRectangle();
		bottomRectangle.setCornerDimensions(new Dimension(1, 1));
		bottomRectangle.setOutline(false);
		bottomRectangle.setFill(false);
		bottomRectangle.setPreferredSize(new Dimension(110, 30));
		bottomRectangle.setMinimumSize(new Dimension(90, 95));

		GridLayout layoutGraphicalNodeContainer2 = new GridLayout();
		layoutGraphicalNodeContainer2.numColumns = 1;
		layoutGraphicalNodeContainer2.horizontalSpacing = 5;
		layoutGraphicalNodeContainer2.verticalSpacing = 5;
		layoutGraphicalNodeContainer2.marginHeight = 5;
		layoutGraphicalNodeContainer2.marginWidth = 5;
		bottomRectangle.setLayoutManager(layoutGraphicalNodeContainer2);
		
		
		GridData constraintBottomGraphicalNodeContainer = new GridData();
		constraintBottomGraphicalNodeContainer.verticalAlignment = GridData.CENTER;
		constraintBottomGraphicalNodeContainer.horizontalAlignment = GridData.CENTER;
		
		//
		
		
		
		
		this.add(leftRectangle, constraintGraphicalNodeContainer);
		

		
		this.add(middleRectangle, constraintMiddleGraphicalNodeContainer);
		
		this.add(bottomRectangle, constraintBottomGraphicalNodeContainer);
		
		//RoundedRectangle middleRectangle2 = new RoundedRectangle();
		//this.add(middleRectangle2, constraintMiddleGraphicalNodeContainer);
		

		// Create inner rectangle inside the left side rectangle.
		containerInsideLeftRectangle = createInnerRectangle(leftRectangle);
		
		containerInsideLeftRectangle2 = createMiddleInnerRectangle(middleRectangle);
		
		containerInsideLeftRectangle3 = createInnerRectangle(bottomRectangle);
		
		//createInnerRectangle(middleRectangle2);

		//ImageDescriptor imgDesc = EsbDiagramEditorPlugin
				//.getBundledImageDescriptor(getIconPath());

		//Image image = imgDesc.createImage();
		Image scaled = new Image(Display.getDefault(), 30, 30);
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		//gc.drawImage(image, 0, 0, image.getBounds().width,
				//image.getBounds().height, 0, 0, 30, 30);
		gc.dispose();

		//ImageFigure img = new ImageFigure(image);
		//img.setSize(new Dimension(36, 40));

		GridData constraintImageRectangle = new GridData();
		constraintImageRectangle.verticalAlignment = GridData.END;
		constraintImageRectangle.horizontalAlignment = GridData.CENTER;
		constraintImageRectangle.horizontalIndent = 0;
		constraintImageRectangle.horizontalSpan = 1;
		constraintImageRectangle.verticalSpan = 2;
		constraintImageRectangle.grabExcessHorizontalSpace = true;
		constraintImageRectangle.grabExcessVerticalSpace = true;
		//figureLayer.add(img, constraintImageRectangle);

		RectangleFigure esbNodeTypeNameRectangle = new RectangleFigure();
		esbNodeTypeNameRectangle.setOutline(false);
		esbNodeTypeNameRectangle.setBackgroundColor(new Color(null, 233, 245,
				215));
		esbNodeTypeNameRectangle.setPreferredSize(new Dimension(64, 20));

		GridData constraintEsbNodeTypeNameRectangle = new GridData();
		constraintEsbNodeTypeNameRectangle.verticalAlignment = GridData.BEGINNING;
		constraintEsbNodeTypeNameRectangle.horizontalAlignment = GridData.CENTER;
		constraintEsbNodeTypeNameRectangle.horizontalIndent = 0;
		constraintEsbNodeTypeNameRectangle.horizontalSpan = 1;
		constraintEsbNodeTypeNameRectangle.verticalSpan = 1;
		constraintEsbNodeTypeNameRectangle.grabExcessHorizontalSpace = true;
		constraintEsbNodeTypeNameRectangle.grabExcessVerticalSpace = true;

		esbNodeTypeNameRectangle.setLayoutManager(new StackLayout());

		// Actual label to display which type this is.
		WrappingLabel esbNodeTypeNameLabel = new WrappingLabel();
		esbNodeTypeNameLabel.setText(getNodeName());
		esbNodeTypeNameLabel.setForegroundColor(new Color(null, 0, 0, 0));
		esbNodeTypeNameLabel.setFont(new Font(null, "Arial", 10, SWT.BOLD));
		esbNodeTypeNameLabel.setAlignment(SWT.CENTER);
		esbNodeTypeNameLabel.setPreferredSize(new Dimension(64, 20));

		//figureLayer.add(esbNodeTypeNameLabel,
				//constraintEsbNodeTypeNameRectangle);
		//pane.add(figureLayer);
		GridData constraintPaneRectangle = new GridData();
		constraintPaneRectangle.verticalAlignment = GridData.FILL;
		constraintPaneRectangle.horizontalAlignment = GridData.FILL;
		constraintPaneRectangle.horizontalIndent = 0;
		constraintPaneRectangle.horizontalSpan = 1;
		constraintPaneRectangle.verticalSpan = 1;
		constraintPaneRectangle.grabExcessHorizontalSpace = true;
		constraintPaneRectangle.grabExcessVerticalSpace = true;
		//containerInsideLeftRectangle.add(pane, constraintPaneRectangle);
	}

	private RoundedRectangle createInnerRectangle(RoundedRectangle leftRectangle) {
		RoundedRectangle innerRect = new RoundedRectangle();
		innerRect.setCornerDimensions(new Dimension(1, 1));
		innerRect.setOutline(false);
		innerRect.setBackgroundColor(this.getBackgroundColor());
		//LineBorder innerRectBorder = new LineBorder(
				//new Color(null, 180, 180, 220), 1, SWT.BORDER_SOLID);
		
		LineBorder innerRectBorder = new LineBorder(
				new Color(null, 40, 40, 70), 1, SWT.BORDER_SOLID);
		
		//LineBorder innerRectBorder = new LineBorder(
				//new Color(null, 200, 0, 0), 1, SWT.BORDER_SOLID);
		
		
		innerRect.setBorder(innerRectBorder);
		innerRect.setPreferredSize(new Dimension(95, 25));
		innerRect.setMinimumSize(new Dimension(80, 100));
		innerRect.setBackgroundColor(new Color(null, 233, 245, 215));
		//innerRect.setBackgroundColor(new Color(null, 255, 255, 200));

		GridLayout innerRectLayout = new GridLayout();
		innerRectLayout.numColumns = 1;
		innerRectLayout.makeColumnsEqualWidth = true;
		innerRect.setLayoutManager(innerRectLayout);

		GridData innerRectGridData = new GridData();
		innerRectGridData.verticalAlignment = GridData.FILL;
		innerRectGridData.horizontalAlignment = GridData.FILL;
		innerRectGridData.horizontalIndent = 0;
		innerRectGridData.horizontalSpan = 0;
		innerRectGridData.grabExcessHorizontalSpace = true;
		innerRectGridData.grabExcessVerticalSpace = true;
		leftRectangle.add(innerRect, innerRectGridData);

		
		//innerRect.add(fFigureLoopStatementNameFigure);
		
		return innerRect;
	}
	
	
	private RoundedRectangle createMiddleInnerRectangle(RoundedRectangle leftRectangle) {
		RoundedRectangle innerRect = new RoundedRectangle();
		innerRect.setCornerDimensions(new Dimension(1, 1));
		innerRect.setOutline(false);
		innerRect.setBackgroundColor(this.getBackgroundColor());
		//LineBorder innerRectBorder = new LineBorder(
				//new Color(null, 180, 180, 220), 2, SWT.BORDER_DOT);
		
		LineBorder innerRectBorder = new LineBorder(
				new Color(null, 40, 40, 70), 1, SWT.BORDER_SOLID);
		
		//LineBorder innerRectBorder = new LineBorder(
				//new Color(null, 200, 0, 0), 2, SWT.BORDER_DOT);
		
		innerRect.setBorder(innerRectBorder);
		innerRect.setPreferredSize(new Dimension(1, 300));
		//innerRect.setMinimumSize(new Dimension(80, 100));
		innerRect.setBackgroundColor(new Color(null, 255, 255, 255));

		GridLayout innerRectLayout = new GridLayout();
		innerRectLayout.numColumns = 1;
		innerRectLayout.makeColumnsEqualWidth = false;
		innerRectLayout.horizontalSpacing=0;
		innerRect.setLayoutManager(innerRectLayout);

		GridData innerRectGridData = new GridData();
		innerRectGridData.verticalAlignment = GridData.FILL;
		innerRectGridData.horizontalAlignment = GridData.CENTER;
		innerRectGridData.horizontalIndent = 0;
		innerRectGridData.horizontalSpan = 0;
		innerRectGridData.grabExcessHorizontalSpace = true;
		innerRectGridData.grabExcessVerticalSpace = true;
		leftRectangle.add(innerRect, innerRectGridData);

		return innerRect;
	}

	public String getIconPath() {
		return "icons/ico20/aggregate-mediator.gif";
	}

	public String getNodeName() {
		return "Aggregate";
	}

	public Color getLabelBackColor() {
		return this.getBackgroundColor();
	}

}
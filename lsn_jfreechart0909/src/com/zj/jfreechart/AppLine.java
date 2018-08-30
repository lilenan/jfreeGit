package com.zj.jfreechart;

import java.awt.Font;
import java.io.File;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class AppLine {
	public static void main(String[] args) throws Exception {
		DefaultCategoryDataset ds=new DefaultCategoryDataset();
		ds.addValue(2000, "IBM", "һ����");
		ds.addValue(2300, "ORACLE", "һ����");
		ds.addValue(2800, "JBOSS", "һ����");
		ds.addValue(3300, "����", "һ����");
		
		ds.addValue(4800, "IBM", "������");
		ds.addValue(4300, "ORACLE", "������");
		ds.addValue(3200, "JBOSS", "������");
		ds.addValue(1800, "����", "������");
		
		ds.addValue(1500, "IBM", "������");
		ds.addValue(2600, "ORACLE", "������");
		ds.addValue(3900, "JBOSS", "������");
		ds.addValue(2100, "����", "������");
		
		String title="ǰ�����ȸ���˾JEE AS����ͳ��";
		JFreeChart chart=ChartFactory.createLineChart(title, "����", "����(��λ����̨)", ds, PlotOrientation.VERTICAL, true, false, false);
		
		//����
		chart.getTitle().setFont(new Font("����", Font.BOLD, 25));
		//��ʾ��
		chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
		CategoryPlot plot=(CategoryPlot) chart.getPlot();
		//��������
		plot.getDomainAxis().setLabelFont(new Font("����", Font.BOLD, 18));
		plot.getRangeAxis().setLabelFont(new Font("����", Font.BOLD, 18));
		//С��ǩ����
		plot.getDomainAxis().setTickLabelFont(new Font("����", Font.PLAIN, 15));
		//plot.setForegroundAlpha(0.6f);
		ChartUtilities.saveChartAsJPEG(new File("f:\\line.jpg"), chart, 800, 500);
	}

}

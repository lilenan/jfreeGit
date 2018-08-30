package com.zj.jfreechart;

import java.awt.Font;
import java.io.File;

import javax.imageio.ImageIO;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class App {
	public static void main(String[] args) throws Exception {
		String title="����˾JEE AS�г�ռ����ͳ��";
		DefaultPieDataset ds=new DefaultPieDataset();
		ds.setValue("IBM", 2000);
		ds.setValue("ORACLE", 3500);
		ds.setValue("JBOSS", 1570);
		ds.setValue("����", 4400);
		JFreeChart chart=ChartFactory.createPieChart3D(title, ds, true, false, false);
		//����
		chart.getTitle().setFont(new Font("����", Font.BOLD, 25));
		chart.getLegend().setItemFont(new Font("����", Font.PLAIN, 18));
		//��ͼ��
		PiePlot plot=(PiePlot) chart.getPlot();
		plot.setLabelFont(new Font("����", Font.BOLD, 15));
		//����
		chart.setBackgroundImage(ImageIO.read(new File("f:\\bg.jpg")));//ͼ��������
		plot.setBackgroundImage(ImageIO.read(new File("f:\\bg1.jpg")));//��ͼ������
		//���÷���Ч��
		plot.setExplodePercent("IBM", 0.1f);
		plot.setExplodePercent("JBOSS", 0.2f);
		//����ǰ��ɫ͸����
		plot.setForegroundAlpha(0.7f);
		//���ñ�ǩ������
		//{0}����˾����
		//{1}������
		//{2}���ٷֱ�
		//{3}������    ֻ��3
		plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}{1}/{3}-{2}"));
		ChartUtilities.saveChartAsJPEG(new File("f:\\pie.jpg"), chart, 800, 500);
	}

}

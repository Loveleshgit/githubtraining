{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 import java.io.*;\
\
public interface Freshers \{\
   String fresher(); \
\} \
\
class Fresher implements Freshers\
\{\
   public String fresher() \{\
	return \'93I am Fresher\'94;\
   \}\
\}\
class NotFresher implements Freshers\
\{\
   public String fresher() \{\
	return \'93I am Experienced\'94;\
   \}\
\}\
\
class tringapps\
\{\
   private String name;\
   private String team;\
    \
   public Freshers employeeType;  \
    \
   public void setName(String name) \{\
	this.name = name;\
   \}\
   public void setTeam(String team) \{\
	this.team = team;\
   \}\
   public void setEmployeeType(String newemployeeType) \{\
	this.employeeType = newemployeeType;\
   \}\
   public String yourType() \{\
	return employeeType.fresher();\
   \}\
\}\
\
class tringapps1 extends tringapps\
\{\
   public tringapps1() \{\
	employeeType = Fresher();\
   \}\
\}\
\
class tringapps2 extends tringapps\
\{\
   public tringapps2() \{\
	employeeType = NotFresher();\
   \}\
\}\
\
class playTringapps\
\{\
   public static void main(String ar[]) \{\
	tringapps e1 = new tringapps1();\
	tringapps e2 = new tringapps2();\
\
	System.out.println(\'93e1:\'94 + e1.yourType());\
	System.out.println(\'93e2:\'94 + e2.yourType());\
   \}\
\}\
\
\
}
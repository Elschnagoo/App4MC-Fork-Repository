/*******************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 * Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.execution.model.elements;

import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.multicore.execution.model.XUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class XMappingUtil
{
        public static void printAlloc(MappingModel mappingModel)
            {

                System.out.println("####################################");
                //System.out.println(mappingModel.getSchedulerAllocation().get(0).getResponsibility().get(0).getName());
                //System.out.println(mappingModel.getSchedulerAllocation().get(0).getScheduler().getName());
                System.out.println(mappingModel.getTaskAllocation().get(0).getScheduler().getName());
                System.out.println(mappingModel.getTaskAllocation().get(0).getTask().getName());

            }

    public static void getScaduler(MappingModel mappingModel,HashMap<String, XScheduler> mapSch, HashMap <String, XCore> mapCor)
            {

                Iterator<SchedulerAllocation> it=mappingModel.getSchedulerAllocation().iterator();
                SchedulerAllocation tmpSchAl;
                String tName;
                XScheduler tempSch;
                XCore tempCore;

                while (it.hasNext()){
                    tmpSchAl=it.next();

                    tName=tmpSchAl.getScheduler().getName();

                    tempCore=mapCor.get(tmpSchAl.getResponsibility().get(0).getName());

                    tempSch=new XScheduler(tName,tempCore);

                    mapSch.put(tName,tempSch);
                }

            }
    public static void addTasks(MappingModel mappingModel,HashMap<String, XScheduler> mapSch, HashMap <String, XTasks> mapTas)
            {

                Iterator<TaskAllocation> it=mappingModel.getTaskAllocation().iterator();
                TaskAllocation tmpSchAl;
                XScheduler tempSch;
                XTasks tempTask;

                String t,s;


                while (it.hasNext()){
                    tmpSchAl=it.next();
                    t=tmpSchAl.getTask().getName();
                    s=tmpSchAl.getScheduler().getName();

                    tempSch=mapSch.get(s);
                    tempTask=mapTas.get(t);

                    if (tempSch!=null&&tempTask!=null)
                        {
                            tempSch.add(tempTask);
                         //   System.out.println("Link "+s+" - "+t);
                        }
                    else
                        {
                            System.err.println("ERROR NULL");
                        }


                }

            }
    public static void addRun(SWModel swModel, HashMap<String, XRunnable> mapRun, HashMap <String, XTasks> mapTas)
        {
            //Iterator<TaskAllocation> it=
            //TaskAllocation tmpSchAl;
            XRunnable tempSch;
            XTasks tempTask;

            String t,r;

        }

    public static void LinkTasks(XScheduler s )
        {
            LinkedList <XTasks> list = s.getTasks();
            XTasks tmp;

            for (int i=0;i<list.size();i++)
                {
                   tmp =list.get(0);
                 //  System.out.println("Sync" +tmp.getName() +"  with   "+list.size());
                    list.remove(tmp);
                    XUtil.se(tmp,list);
                    list.addLast(tmp);
                }
            for (XTasks element:list
                 ) {
                for (String key: element.getProducer().keySet()
                     ) {
                    XTasks linked=element.getProducer().get(key);
                    linked.addConsumer(element);
                }
            }



        }
}

package com.launcher;

import java.awt.Dimension;
import java.awt.Image;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.*;


public class utilidades {
    
       public static void imp(JPanel content, JPanel instance) {
           
        instance.setSize(content.getSize());      
        content.removeAll();
        content.add(instance);
        content.revalidate();
        content.repaint();
       
       }

        public static void reescala(JLabel labelName, String root, Dimension dimension){
                
                ImageIcon image = new ImageIcon(root);
                Icon icon = new ImageIcon(image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH));
                labelName.setIcon(icon);
                labelName.repaint();
            
        }
        //  RUTAS JSON ESCUDOS
         public static String[] getRuta_Escudo(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                JSONArray rutasEscudoArray = jsonObject.getJSONArray("rutas_escudo");
                String[] rutasescudo = new String [rutasEscudoArray.length()];
                for (int i = 0; i < rutasEscudoArray.length(); i++){
                    rutasescudo[i] = rutasEscudoArray.getString(i);
                }
                return rutasescudo;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         // RUTAS JSON HOME
         public static String[] getRuta_Home(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(1);
                JSONArray rutasHomeArray = jsonObject.getJSONArray("rutas_home");
                String[] rutashome = new String [rutasHomeArray.length()];
                for (int i = 0; i < rutasHomeArray.length(); i++){
                    rutashome[i] = rutasHomeArray.getString(i);
                }
                return rutashome;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         // RUTAS JSON EMBARQUE
         public static String[] getRuta_Embarque(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(2);
                JSONArray rutasEmbarqueArray = jsonObject.getJSONArray("rutas_embarque");
                String[] rutasembarque = new String [rutasEmbarqueArray.length()];
                for (int i = 0; i < rutasEmbarqueArray.length(); i++){
                    rutasembarque[i] = rutasEmbarqueArray.getString(i);
                }
                return rutasembarque;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         // RUTAS JSON HEMORRAGIA
         public static String[] getRuta_Hemorragia(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(3);
                JSONArray rutasHemorragiaArray = jsonObject.getJSONArray("rutas_hemorragia");
                String[] rutashemorragia = new String [rutasHemorragiaArray.length()];
                for (int i = 0; i < rutasHemorragiaArray.length(); i++){
                    rutashemorragia[i] = rutasHemorragiaArray.getString(i);
                }
                return rutashemorragia;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         // RUTAS JSON EXTINCION
         public static String[] getRuta_Extincion(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(4);
                JSONArray rutasExtincionArray = jsonObject.getJSONArray("rutas_extincion");
                String[] rutasextincion = new String [rutasExtincionArray.length()];
                for (int i = 0; i < rutasExtincionArray.length(); i++){
                    rutasextincion[i] = rutasExtincionArray.getString(i);
                }
                return rutasextincion;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         // RUTAS JSON EPIS
         public static String[] getRuta_EPIS(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(5);
                JSONArray rutasEPISArray = jsonObject.getJSONArray("rutas_epis");
                String[] rutasEPIS = new String [rutasEPISArray.length()];
                for (int i = 0; i < rutasEPISArray.length(); i++){
                    rutasEPIS[i] = rutasEPISArray.getString(i);
                }
                return rutasEPIS;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         // RUTAS JSON HELICOPTERO
         public static String[] getRuta_Helicoptero(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(6);
                JSONArray rutasHelicopteroArray = jsonObject.getJSONArray("rutas_helicoptero");
                String[] rutasHelicoptero = new String [rutasHelicopteroArray.length()];
                for (int i = 0; i < rutasHelicopteroArray.length(); i++){
                    rutasHelicoptero[i] = rutasHelicopteroArray.getString(i);
                }
                return rutasHelicoptero;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         // RUTAS JSON ASCENSOR
         public static String[] getRuta_Ascensor(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(7);
                JSONArray rutasAscensorArray = jsonObject.getJSONArray("rutas_ascensor");
                String[] rutasAscensor = new String [rutasAscensorArray.length()];
                for (int i = 0; i < rutasAscensorArray.length(); i++){
                    rutasAscensor[i] = rutasAscensorArray.getString(i);
                }
                return rutasAscensor;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
            //  RUTAS JSON INDICE
         public static String[] getRutaind(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(8);
                JSONArray rutasindArray = jsonObject.getJSONArray("rutasind");
                String[] rutasind = new String [rutasindArray.length()];
                for (int i = 0; i < rutasindArray.length(); i++){
                    rutasind[i] = rutasindArray.getString(i);
                }
                return rutasind;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
            //RUTAS JSON FLECHAS
         public static String[] getRutaflecha(String ubicacion){
            try (FileReader reader = new FileReader(ubicacion)){
                JSONArray jsonArray = new JSONArray(new JSONTokener(reader));
                JSONObject jsonObject = jsonArray.getJSONObject(9);
                JSONArray rutasflechaArray = jsonObject.getJSONArray("rutasflecha");
                String[] rutasflecha = new String [rutasflechaArray.length()];
                for (int i = 0; i < rutasflechaArray.length(); i++){
                    rutasflecha[i] = rutasflechaArray.getString(i);
                }
                return rutasflecha;
            }catch (JSONException e){
                e.printStackTrace();
                return null;
            } catch (IOException ex) {
               Logger.getLogger(utilidades.class.getName()).log(Level.SEVERE, null, ex);
           }return null;
        }
         
    
}
       


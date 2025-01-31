
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokensmpgodshards.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.brokensmpgodshards.client.model.Modelzombiesurvor;
import net.mcreator.brokensmpgodshards.client.model.ModelzomS;
import net.mcreator.brokensmpgodshards.client.model.Modelzero;
import net.mcreator.brokensmpgodshards.client.model.ModelvindicatorBUTCHER;
import net.mcreator.brokensmpgodshards.client.model.Modelturret;
import net.mcreator.brokensmpgodshards.client.model.Modeltuffven;
import net.mcreator.brokensmpgodshards.client.model.Modeltuff_ven;
import net.mcreator.brokensmpgodshards.client.model.Modeltropicalfishbetween;
import net.mcreator.brokensmpgodshards.client.model.Modelthrowing;
import net.mcreator.brokensmpgodshards.client.model.Modeltaze_Converted;
import net.mcreator.brokensmpgodshards.client.model.Modelslash;
import net.mcreator.brokensmpgodshards.client.model.Modelsixoninepic;
import net.mcreator.brokensmpgodshards.client.model.Modelsixo;
import net.mcreator.brokensmpgodshards.client.model.Modelsix;
import net.mcreator.brokensmpgodshards.client.model.Modelscrap_trap;
import net.mcreator.brokensmpgodshards.client.model.Modelscapball;
import net.mcreator.brokensmpgodshards.client.model.Modelrust;
import net.mcreator.brokensmpgodshards.client.model.Modelplayerhatchet;
import net.mcreator.brokensmpgodshards.client.model.ModelpillagersixSS;
import net.mcreator.brokensmpgodshards.client.model.Modelpic609;
import net.mcreator.brokensmpgodshards.client.model.Modelmimic;
import net.mcreator.brokensmpgodshards.client.model.Modelhummans;
import net.mcreator.brokensmpgodshards.client.model.Modelhummanhaz;
import net.mcreator.brokensmpgodshards.client.model.Modelgolm_metalic;
import net.mcreator.brokensmpgodshards.client.model.Modelgolm;
import net.mcreator.brokensmpgodshards.client.model.Modelentiysix;
import net.mcreator.brokensmpgodshards.client.model.Modeldaggerss_Converted;
import net.mcreator.brokensmpgodshards.client.model.Modelchestmimic;
import net.mcreator.brokensmpgodshards.client.model.Modelbetweenturret;
import net.mcreator.brokensmpgodshards.client.model.ModelCustomModel;
import net.mcreator.brokensmpgodshards.client.model.ModelBetween_trap;
import net.mcreator.brokensmpgodshards.client.model.ModelAdmineye;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BrokenSmpGodShardsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelslash.LAYER_LOCATION, Modelslash::createBodyLayer);
		event.registerLayerDefinition(Modelhummanhaz.LAYER_LOCATION, Modelhummanhaz::createBodyLayer);
		event.registerLayerDefinition(Modelmimic.LAYER_LOCATION, Modelmimic::createBodyLayer);
		event.registerLayerDefinition(ModelvindicatorBUTCHER.LAYER_LOCATION, ModelvindicatorBUTCHER::createBodyLayer);
		event.registerLayerDefinition(Modelpic609.LAYER_LOCATION, Modelpic609::createBodyLayer);
		event.registerLayerDefinition(Modelscapball.LAYER_LOCATION, Modelscapball::createBodyLayer);
		event.registerLayerDefinition(ModelAdmineye.LAYER_LOCATION, ModelAdmineye::createBodyLayer);
		event.registerLayerDefinition(Modeltuff_ven.LAYER_LOCATION, Modeltuff_ven::createBodyLayer);
		event.registerLayerDefinition(Modelsixoninepic.LAYER_LOCATION, Modelsixoninepic::createBodyLayer);
		event.registerLayerDefinition(Modelzombiesurvor.LAYER_LOCATION, Modelzombiesurvor::createBodyLayer);
		event.registerLayerDefinition(Modelentiysix.LAYER_LOCATION, Modelentiysix::createBodyLayer);
		event.registerLayerDefinition(Modelgolm_metalic.LAYER_LOCATION, Modelgolm_metalic::createBodyLayer);
		event.registerLayerDefinition(Modelscrap_trap.LAYER_LOCATION, Modelscrap_trap::createBodyLayer);
		event.registerLayerDefinition(Modelsix.LAYER_LOCATION, Modelsix::createBodyLayer);
		event.registerLayerDefinition(Modelplayerhatchet.LAYER_LOCATION, Modelplayerhatchet::createBodyLayer);
		event.registerLayerDefinition(Modeldaggerss_Converted.LAYER_LOCATION, Modeldaggerss_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelsixo.LAYER_LOCATION, Modelsixo::createBodyLayer);
		event.registerLayerDefinition(Modelrust.LAYER_LOCATION, Modelrust::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(ModelzomS.LAYER_LOCATION, ModelzomS::createBodyLayer);
		event.registerLayerDefinition(Modelbetweenturret.LAYER_LOCATION, Modelbetweenturret::createBodyLayer);
		event.registerLayerDefinition(Modeltuffven.LAYER_LOCATION, Modeltuffven::createBodyLayer);
		event.registerLayerDefinition(ModelpillagersixSS.LAYER_LOCATION, ModelpillagersixSS::createBodyLayer);
		event.registerLayerDefinition(Modelzero.LAYER_LOCATION, Modelzero::createBodyLayer);
		event.registerLayerDefinition(Modelthrowing.LAYER_LOCATION, Modelthrowing::createBodyLayer);
		event.registerLayerDefinition(ModelBetween_trap.LAYER_LOCATION, ModelBetween_trap::createBodyLayer);
		event.registerLayerDefinition(Modelgolm.LAYER_LOCATION, Modelgolm::createBodyLayer);
		event.registerLayerDefinition(Modelchestmimic.LAYER_LOCATION, Modelchestmimic::createBodyLayer);
		event.registerLayerDefinition(Modeltaze_Converted.LAYER_LOCATION, Modeltaze_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelturret.LAYER_LOCATION, Modelturret::createBodyLayer);
		event.registerLayerDefinition(Modelhummans.LAYER_LOCATION, Modelhummans::createBodyLayer);
		event.registerLayerDefinition(Modeltropicalfishbetween.LAYER_LOCATION, Modeltropicalfishbetween::createBodyLayer);
	}
}

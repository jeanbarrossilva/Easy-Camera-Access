package com.jeanbarrossilva.eca.service

import android.content.Intent
import android.provider.MediaStore
import android.service.quicksettings.TileService

class ECAService: TileService() {
	private fun openCamera() {
		val intent = Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA).apply {
			addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
		}
		startActivityAndCollapse(intent)
	}
	
	override fun onClick() = openCamera()
}
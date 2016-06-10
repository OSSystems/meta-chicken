SECTION = "devel/chicken"
DESCRIPTION = "Bindings to libusb"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://usb.meta;md5=9a6768cd732417f785349b2c1f853b62"
DEPENDS_append_class-cross = " libusb-native"
DEPENDS_append_class-crosssdk = " libusb-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-libusb"
DEPENDS = " libusb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/usb/usb-${PV}.tar.gz"

SRC_URI[md5sum] = "bf79a92df9ba49057d70cbc528e596c3"
SRC_URI[sha256sum] = "260e40472d1a9dfa7669dcde210e779e921c7235aceb040816ecd958c76cbcc8"

S = "${WORKDIR}/usb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

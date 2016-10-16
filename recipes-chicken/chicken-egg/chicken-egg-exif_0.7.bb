SECTION = "devel/chicken"
DESCRIPTION = "Binding to libexif, reading EXIF meta data from digital camera images."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://exif.meta;md5=b88e4736394f169f526d04c6331721b5"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross libexif-native"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk libexif-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners nativesdk-libexif chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-foreigners libexif chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/exif/exif-${PV}.tar.gz"

SRC_URI[md5sum] = "04787ef4d4cd96b6ffa5968960df4ca3"
SRC_URI[sha256sum] = "80d318b08b8f2b0a97b36378156cfcc78a5a9ceece9b27020c8fb4f1be785e86"

S = "${WORKDIR}/exif-${PV}"

require chicken-egg-exif.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

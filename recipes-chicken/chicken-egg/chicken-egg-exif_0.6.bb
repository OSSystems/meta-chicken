SECTION = "devel/chicken"
DESCRIPTION = "Binding to libexif, reading EXIF meta data from digital camera images."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://exif.meta;md5=b88e4736394f169f526d04c6331721b5"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross libexif-native"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk libexif-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners nativesdk-chicken-egg-libexif chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-foreigners libexif chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/exif/exif-${PV}.tar.gz"

SRC_URI[md5sum] = "aaa6f394899fb5a9f9c8ac78e399ffa0"
SRC_URI[sha256sum] = "755e0714b88c59bb745d043d6fadc429b3243c0d40f576a4fb054c9943f0b84e"

S = "${WORKDIR}/exif-${PV}"

require chicken-egg-exif.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

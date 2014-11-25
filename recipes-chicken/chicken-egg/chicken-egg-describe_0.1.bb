SECTION = "devel/chicken"
DESCRIPTION = "Describe objects in detail"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://describe.meta;md5=d6b6be7083eef99cf608c509beff96e7"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "b70164018830342e98c416481a898d75"
SRC_URI[sha256sum] = "3332e95310f663a44a14f71bdf0ee5f88277fa99fd280002de03ecf2d342ce2d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

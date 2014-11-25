SECTION = "devel/chicken"
DESCRIPTION = "A packrat parsing library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://packrat.meta;md5=550acbffd916621243ab37e1be1dbb82"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "3e7087c23ac88b3212946ff023afbd83"
SRC_URI[sha256sum] = "a5289851d14f83cf6996c5f845501ae4b073b767535dc0d297ed3a15c729c811"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

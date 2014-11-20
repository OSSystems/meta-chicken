SECTION = "devel/chicken"
DESCRIPTION = "A JSON library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://json.meta;md5=0a9020a355f36a4a5b66f5f940d1e373"
DEPENDS_class-cross += "chicken-egg-packrat-cross"
DEPENDS += "chicken-egg-packrat chicken-egg-packrat-cross"
RDEPENDS_${PN} += "chicken-egg-packrat"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7141ea314a4460e591264d93178ec4f1"
SRC_URI[sha256sum] = "8c46086378ece3f76be4d47a51852b1999df318398e4a8f9a1d4d721965ef52d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"

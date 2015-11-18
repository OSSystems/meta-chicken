SECTION = "devel/chicken"
DESCRIPTION = "Experimental copy of the original Xerox PARC copy of tiny-clos"
LICENSE = "XEROX"
LIC_FILES_CHKSUM = "file://tinyclos-xerox.meta;md5=dee951e4e71a320609c89bfe165f9be6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tinyclos-xerox/tinyclos-xerox-${PV}.tar.gz"

SRC_URI[md5sum] = "00bb90d2bcdc281c4512e9eaafcb7bad"
SRC_URI[sha256sum] = "c3878214a56563e55192d3576e8d0b3baef75de3450dba0a92275b669e8c4cdb"

S = "${WORKDIR}/tinyclos-xerox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

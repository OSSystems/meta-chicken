SECTION = "devel/chicken"
DESCRIPTION = "Hygienic MATCH replacement"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://matchable.meta;md5=7339f5d3f4c35990b880102f418a94be"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/matchable/matchable-${PV}.tar.gz"

SRC_URI[md5sum] = "4ece4fbadac8433ce715af9403ba891b"
SRC_URI[sha256sum] = "ef33a3c3aded797d85055f618037cf339381ffd092abca6ec83026d11081f83d"

S = "${WORKDIR}/matchable-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "Dorai Sitaram's embedding of logic programming into Scheme"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://schelog.meta;md5=65474a022bd5fd3a5bd5d6e1f667e95b"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/schelog/schelog-${PV}.tar.gz"

SRC_URI[md5sum] = "b112f446cb5fd4640818eb3a75bfbafc"
SRC_URI[sha256sum] = "f9f5440f60f7c02e11da2968feceb844f4bb916cf6dcc16579d3999b5ce99520"

S = "${WORKDIR}/schelog-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "Dorai Sitaram's embedding of logic programming into Scheme"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://schelog.meta;md5=65474a022bd5fd3a5bd5d6e1f667e95b"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/schelog/schelog-${PV}.tar.gz"

SRC_URI[md5sum] = "92034ba4aae250073cbb565912746379"
SRC_URI[sha256sum] = "cb2c8d81744bb443bf7e8f249d0b2ad6c10ab05995419ee017d6d0b96cdf9123"

S = "${WORKDIR}/schelog-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

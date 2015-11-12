SECTION = "devel/chicken"
DESCRIPTION = "Procedural record-type interface"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://records.meta;md5=d5b50c61e3801ffbd6c175de1e6c0704"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/records/records-${PV}.tar.gz"

SRC_URI[md5sum] = "73f5db1b73ed783c2b0bdb9add008fb7"
SRC_URI[sha256sum] = "7d908626d5200860f0093783025caa3b37eeddcadb10fc8d9ad7559894a46d1d"

S = "${WORKDIR}/records-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

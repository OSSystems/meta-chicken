SECTION = "devel/chicken"
DESCRIPTION = "Serialnumber arithmetic as described in rfc1982"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://serial.meta;md5=40291666c1734f4bf30a8357463de7ec"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/serial/serial-${PV}.tar.gz"

SRC_URI[md5sum] = "735932d92887d00e226938ec5cdb7b93"
SRC_URI[sha256sum] = "3ae71517366f4eb73f4a7b50ac98c6f5aa3a91929d3643ccacc9e841f9f80fef"

S = "${WORKDIR}/serial-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

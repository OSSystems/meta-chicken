SECTION = "devel/chicken"
DESCRIPTION = "User defined evaluation environments"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://environments.meta;md5=38e3680265fa22950ba5658fb3d81b18"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/environments/environments-${PV}.tar.gz"

SRC_URI[md5sum] = "8f4a81143a8ea3aab1d7f978c34de554"
SRC_URI[sha256sum] = "b298d98618df08b42e3c2d81535939884c5bbe5bfbd6b2ff54efa02bdf0fe844"

S = "${WORKDIR}/environments-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

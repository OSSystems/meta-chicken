SECTION = "devel/chicken"
DESCRIPTION = "Binary pattern matching"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bitstring.meta;md5=3d09617c5dd6e5c521a728622449427f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bitstring/bitstring-${PV}.tar.gz"

SRC_URI[md5sum] = "b54889d2b6cfc4c815de1a244a5f5915"
SRC_URI[sha256sum] = "e9f4ceadc0c30e84266ab1a0374f3c965f8619a58907b0eab015df4a277fa37a"

S = "${WORKDIR}/bitstring-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

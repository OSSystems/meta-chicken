SECTION = "devel/chicken"
DESCRIPTION = "Gap buffer."
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://gap-buffer.meta;md5=31d064a1605cf138ec23187537d30a7e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gap-buffer/gap-buffer-${PV}.tar.gz"

SRC_URI[md5sum] = "fd42323317f066689437587e21b09466"
SRC_URI[sha256sum] = "f655187fe0b68836513b0b5e2da42bd64bad45211dd0d18810be0809bb7de2c2"

S = "${WORKDIR}/gap-buffer-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
